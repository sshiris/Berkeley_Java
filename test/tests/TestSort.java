package tests;

import org.junit.Test;
import src.Sort;

import static com.google.common.truth.Truth.assertThat;
public class TestSort {
    /** Tests the sort method of the Sort class. */
    @Test
    public void testFindSmallest() {
        String[] input = {"cows", "dwell", "above", "clouds"};
        int expected = 2;
        int actual = Sort.findSmallest(input,0);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSwap(){
        String[] input = {"rawr", "a", "zaza", "newway"};
        String[] expected = {"a", "rawr", "zaza","newway"};
        Sort.swap(input, 1, 0);

        assertThat(input).isEqualTo(expected);
    }

    @Test
    public void testSort(){
        String[] input = {"cows", "dwell", "above", "clouds"};
        String[] expected = {"above", "clouds", "cows", "dwell"};
        Sort.sort(input);

        assertThat(input).isEqualTo(expected);
    }
}

