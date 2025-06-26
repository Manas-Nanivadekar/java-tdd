#!/usr/bin/env bash
source "$(dirname "$0")/exercises.sh"      # loads $EXERCISES
GROUP=com.example.tutorial

for ex in "${EXERCISES[@]}"; do
  dir="questions/$ex"
  [[ -d "$dir" ]] && continue              # skip if already exists
  mvn -q -B archetype:generate \
      -DarchetypeGroupId=org.apache.maven.archetypes \
      -DarchetypeArtifactId=maven-archetype-quickstart \
      -DgroupId=$GROUP.$ex \
      -DartifactId=$ex \
      -Dpackage=$GROUP.$ex \
      -DoutputDirectory=questions

  # strip implementation, leave TODO
  sed -i '' -e '/System.out/d' \
           -e '/return/d' \
           -e '$i\ \ \ \ // TODO implement' \
           "$dir"/src/main/java/**/*.java
done
