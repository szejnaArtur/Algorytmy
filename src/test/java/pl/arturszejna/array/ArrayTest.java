package pl.arturszejna.array;

import junit.framework.Assert;
import org.junit.Test;
import pl.arturszejna.converter.Converter;


public class ArrayTest {

    private String numbers = "1434\n" + "1038\n" + "495\n" + "4476\n" + "1285\n" + "132\n" + "4320\n" + "4600\n" + "4595\n" + "2032\n" + "4400\n" +
            "4898\n" + "3514\n" + "3435\n" + "1609\n" + "213\n" + "1961\n" + "446\n" + "1586\n" + "71\n" + "72\n" + "45\n" + "378\n" + "1257\n" + "4926\n" +
            "3064\n" + "2554\n" + "2137\n" + "4091\n" + "4084\n" + "1001\n" + "3327\n" + "3265\n" + "3341\n" + "4477\n" + "2785\n" + "4266\n" + "3612\n" + "3353\n" + "1754\n" +
            "3388\n" + "3760\n" + "1567\n" + "2473\n" + "3227\n" + "2950\n" + "392\n" + "977\n" + "503\n" +
            "634\n" + "3101\n" + "1002\n" + "4384\n" + "598\n" + "2215\n" + "1302\n" + "4790\n" + "2322\n" + "48\n" + "2477\n" + "3067\n" + "4388\n" + "4757\n" + "1885\n" + "4213\n" + "1664\n" + "3845\n" + "4683\n" + "2328\n" + "100\n" + "1307\n" + "4226\n" + "2878\n" + "1128\n" + "4676\n" + "1369\n" + "1606\n" + "2998\n" + "663\n" + "4306\n" + "3902\n" + "3989\n" + "1620\n" + "3119\n" + "1503\n" + "3040\n" + "829\n" + "4410\n" + "4369\n" + "1553\n" + "3800\n" + "223\n" + "694\n" + "2332\n" + "1197\n" + "4774\n" + "1212\n" +
            "2223\n" + "2941\n" + "3516";

    private int[] numbersArray = Converter.generatedIntegerArray(numbers, 100);
    private Array array = new Array(numbersArray);


    @Test
    public void sumArrayElementsTest(){
        int expected = 249772;
        int actual = array.sumArrayElement();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findMinTest() {

        Integer min = array.findMin(0, numbersArray.length - 1);
        Integer expected = 45;

        Assert.assertEquals(expected, min);
    }

    @Test
    public void findMaxTest() {
        Integer max = array.findMax(0, numbersArray.length - 1);
        Integer expected = 4926;

        Assert.assertEquals(expected, max);
    }
}
