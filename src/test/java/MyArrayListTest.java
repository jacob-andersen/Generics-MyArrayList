import org.junit.Assert;
import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void addTest()
    {
        //Given

        MyArrayList <String> newlist = new MyArrayList(2);

        //When
        newlist.add("eric");
        newlist.add("benny");
        newlist.add("johnny");
        newlist.add("iglesias");

        //Then

        String expected = "iglesias";
        String actual = newlist.get(3);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addAtIndexTest()
    {
        MyArrayList <String> newlist = new MyArrayList(3);
        newlist.add(0,"elephant");
        newlist.add(1,"giraffe");
        newlist.add(2,"tiger");
        newlist.add(3,"gazelle");

        String expected = "elephant";
        String actual = newlist.get(0);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest()
    {
        MyArrayList <String> newlist = new MyArrayList();

        //When
        newlist.add("eric");
        newlist.add("benny");
        newlist.add("johnny");
        newlist.add("iglesias");
        newlist.remove("benny");
        //Then

        boolean expected = false;
        boolean actual = newlist.contains("benny");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeWithIndexTest()
    {
        MyArrayList <String> newlist = new MyArrayList();

        //When
        newlist.add("eric");
        newlist.add("benny");
        newlist.add("johnny");
        newlist.add("iglesias");
        newlist.remove(2,"johnny");
        //Then

        boolean expected = false;
        boolean actual = newlist.contains("johnny");
        Assert.assertEquals(expected,actual);
    }



    @Test
        public void sizeTest()
        {
            MyArrayList <String> newlist = new MyArrayList();
            newlist.add("elephant");

            int expected = 1;
            int actual = newlist.size();

            Assert.assertEquals(expected,actual);
        }

        @Test
    public void setTest()
        {
            MyArrayList <String> newlist = new MyArrayList();
            newlist.set(0,"elephant");

            String expected = "elephant";
            String actual = newlist.get(0);

            Assert.assertEquals(expected,actual);
        }

        @Test
    public void getTest()
        {
            MyArrayList <String> newlist = new MyArrayList();
            newlist.add("elephant");

            String expected = "elephant";
            String actual = newlist.get(0);

            Assert.assertEquals(expected,actual);
        }

        @Test
    public void clearTest()
        {
            MyArrayList <Integer> newlist = new MyArrayList();
            for (int i=0; i<10;i++)
            {
                newlist.add(i);
            }

            newlist.clear();

            int expected = 0;
            int actual = newlist.size();

            Assert.assertEquals(expected,actual);
        }

        @Test
    public void isEmptyFalseTest()
        {
            MyArrayList <Integer> newlist = new MyArrayList();
            newlist.add(23);

            boolean expected = false;
            boolean actual = newlist.isEmpty();

            Assert.assertEquals(expected,actual);
        }

    @Test
    public void isEmptyTrueTest()
    {
        MyArrayList <Integer> newlist = new MyArrayList();
        newlist.add(23);
        newlist.remove(23);

        boolean expected = true;
        boolean actual = newlist.isEmpty();

        Assert.assertEquals(expected,actual);
    }



        @Test
    public void containsTest()
        {
            MyArrayList <String> newlist = new MyArrayList();
            newlist.add("elephant");

            boolean expected = true;
            boolean actual = newlist.contains("elephant");

            Assert.assertEquals(expected,actual);
        }

        @Test
    public void myArrayListLengthTest()
        {
            MyArrayList <String> newlist = new MyArrayList(5);
            newlist.add("elephant");
            newlist.add("eric");
            newlist.add("jenga");

            int expected = 3;
            int actual = newlist.size();

            Assert.assertEquals(expected,actual);
        }
}


