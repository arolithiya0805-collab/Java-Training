package Day13;

public class Problem11 {
    public class exception_example_02 {

    static void validate_mark(int[] arr) throws Exception
    {
        for(int ele : arr)
        {
            if(ele < 0)
                throw new RuntimeException("Invalid mark");
        }
        System.out.println("valid");
    }
    static void main()
    {
      int[] marks = {10,20,-30,40,50};
      try
      {
          validate_mark(marks);
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
          e.printStackTrace();
      }

    }
}

    
    
}
