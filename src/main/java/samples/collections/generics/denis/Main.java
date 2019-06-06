package samples.collections.generics.denis;

public class Main {

    public static void checkAndIncrement( Parameter<Integer> param){
        if( param.getValue() < 10){
            param.setValue(param.getValue() + 1);
        }else{
            param.setValue(0);
        }
    }

    public static void checkAndIncrementGen( Parameter param){
        if( (Integer)param.getValue() < 10){
            param.setValue((Integer)param.getValue() + 1);
        }else{
            param.setValue(0);
        }
    }

    public static void main(String[] args) {
	// write your code here
     //   List
        Parameter<Integer> paramFirst
                = new Parameter<>("count" , 3);
        Parameter<String> paramSecond =
                new Parameter<>("server" , "127.0.0.1");
        checkAndIncrement(paramFirst);

        checkAndIncrementGen( paramFirst );
        // runtime Exception
        //checkAndIncrementGen( paramSecond );

        System.out.println( paramFirst );
        Operations op = new Operations(3);
        op.add(4);
        op.add(5);
        //op.add("");
        System.out.println(op);
    }
}
