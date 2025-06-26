#!/usr/bin/env bash
source "$(dirname "$0")/exercises.sh"

for ex in "${EXERCISES[@]}"; do
  rsync -a --delete \
        --exclude='target' \
        "questions/$ex/" "solutions/$ex/"
done