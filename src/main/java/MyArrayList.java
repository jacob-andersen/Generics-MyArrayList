import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArrayList <T>
{
    private T []arr;
    private int actualsize=0;

    public MyArrayList()
    {
        this(10);
    }

    public MyArrayList(int length)
    {
        arr = (T[])new Object[length];
    }

    public int size ()
    {
    return actualsize;
    }

    public void add(T e)
    {
        if (actualsize==arr.length)
        {
            Object[]temp=new Object[arr.length+1];
            for (int i=0;i<arr.length;i++)
            {
                temp[i]=arr[i];
            }

            arr=(T[])temp;
        }
        arr[actualsize]=e;
        actualsize++;
    }



    public void add(int index, T e)
    {
            //if (actualsize==arr.length)
            //{
                Object[] temp = new Object[arr.length + 1];
                for (int i = 0; i < arr.length; i++)
                {
                    temp[i] = arr[i];
                }

                for(int i=0;i<index;i++)
                {
                    temp[i]=arr[i];
                }
                temp[index]=e;
                for (int i=index+1;i<arr.length;i++)
                {
                    temp[i]=arr[i-1];
                }
                arr = (T[]) temp;
                actualsize++;
            }



    public T get(int index)
    {
    return arr[index];
    }

    public void set(int index, T e)
    {
        arr[index]=e;
    }

    public void clear()
    {
        for (int i=0;i<arr.length-1;i++)
        {
            arr[i]=null;
        }
        actualsize=0;
    }

    public boolean isEmpty()
    { for(int i=0;i<arr.length;i++)
    {
      if (actualsize==0)
      {
          return true;
      }
    }
    return false;
    }

    public boolean contains(T e)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]==e)
            {
                return true;
            }
        }
        return false;
    }

    public void remove(T e) {
        {
            int count=0;
            Object[] temp = new Object[arr.length - 1];
            for (int i = 0; i < actualsize; i++) {
                if (!arr[i].equals(e))
                {
                    temp[count] = arr[i];
                    count++;
                }
            }
            arr = (T[])temp;
            actualsize--;
        }
    }

    public void remove(int index, T e)
    {
        int count=0;
        Object[] temp = new Object[arr.length - 1];
        for (int i = 0; i < actualsize; i++) {
            if (index!=i)
            {
                temp[count] = arr[i];
                count++;
            }
        }
        arr = (T[]) temp;
        actualsize--;
    }

}