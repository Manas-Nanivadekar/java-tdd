package com.example.findhighestnumber;

public class HighestNumberFinderTest {
    @Test
    public void find_highest_in_array_of_one_expect_single_item() 
    {
        // Arrange
        int array[] = 
        {
            10
        };
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 10;
        
        // Act
        int result = cut.findHighestNumber( array );
        
        // Assert
        assertEquals( expectedResult, result );
    }
    
    @Test
    public  void    find_highest_in_array_of_two_descending_expect_first_element()
    {
        // Arrange
        int array[] = {20, 10};
        int expectedResult = 20;
        HighestNumberFinder cut = new HighestNumberFinder();
        
        // Act
        int result = cut.findHighestNumber(array);
        
        // Assert
        assertEquals(expectedResult, result);
    }
    
    @Test
    public  void    find_highest_in_array_of_two_ascending_expect_second_element()
    {
        // Arrange
        int array[] = {10, 20};
        int expectedResult = 20;
        HighestNumberFinder cut = new HighestNumberFinder();
        
        // Act
        int result = cut.findHighestNumber(array);
        
        // Assert
        assertEquals(expectedResult, result);
    }
    
    @Test
    public  void    find_highest_in_array_of_two_equals_expect_first_element()
    {
        // Arrange
        int array[] = {10, 10};
        int expectedResult = 10;
        HighestNumberFinder cut = new HighestNumberFinder();
        
        // Act
        int result = cut.findHighestNumber(array);
        
        // Assert
        assertEquals(expectedResult, result);
    }
    
    @Test
    public  void    find_highest_in_array_of_several_items_expect_highest_element()
    {
        // Arrange
        int array[] = {10, 20, 5, 17, 37, 14};
        int expectedResult = 37;
        HighestNumberFinder cut = new HighestNumberFinder();
        
        // Act
        int result = cut.findHighestNumber(array);
        
        // Assert
        assertEquals(expectedResult, result);
    }
}
