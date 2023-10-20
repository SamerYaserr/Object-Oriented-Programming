import java.sql.SQLOutput;
import java.util.*;
import java.util.EnumSet;
import java.util.EnumMap;
import static java.lang.Math.*;
import java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {

        Numbers val = Numbers.TWO;

        switch ( val ){

            case ONE :
                System.out.println("1");
                break;
            case TWO :
                System.out.println("2");
                break;
            case THREE :
                System.out.println("3");
                break;

        }

        System.out.println("--------------------------------------------");

        //-------------------------------------------------------------------------------


        System.out.println( WeekDays.MONDAY.getStatus() );
        System.out.println( WeekDays.FRIDAY.getStatus() );

        System.out.println("--------------------------------------------");

        //-------------------------------------------------------------------------------


        AbstractEnum.Enum1.print();
        AbstractEnum.Enum2.print();

        System.out.println("--------------------------------------------");

        //-------------------------------------------------------------------------------

        ArrayList<String> items = new ArrayList();
        items.add("Burger");
        items.add("Fries");

        Order o1 = new Order("Samer" , "01021177777",items );
        System.out.println( o1.isDeliverable() );

        o1.setStatus(OrderStatus.DELIVERING);
        System.out.println( o1.isDeliverable() );

        System.out.println(o1);

        System.out.println("--------------------------------------------");

        //-------------------------------------------------------------------------------

        EnumSet<WeekDays> days = EnumSet.of(WeekDays.MONDAY);
        System.out.println(days);

        days = EnumSet.of(WeekDays.MONDAY , WeekDays.FRIDAY);
        System.out.println(days);

        days = EnumSet.of(WeekDays.MONDAY , WeekDays.MONDAY);
        System.out.println(days);

        days = EnumSet.allOf( WeekDays.class );
        System.out.println( days );

        days = EnumSet.range( WeekDays.WEDNESDAY , WeekDays.SATURDAY );
        System.out.println(days);

        days = EnumSet.noneOf( WeekDays.class );
        System.out.println(days);

        days.add( WeekDays.FRIDAY );
        days.add( WeekDays.THURSDAY);
        System.out.println( days );

        EnumSet<WeekDays> days2 = EnumSet.of( WeekDays.WEDNESDAY , WeekDays.SATURDAY  );
        days.addAll( days2 );
        System.out.println( days );

        days.remove( WeekDays.SATURDAY );
        System.out.println( days );

        days.removeAll( days2 );
        System.out.println( days );

        System.out.println("--------------------------------------------");

        //-------------------------------------------------------------------------------

        EnumMap< WeekDays , String > dayMap = new EnumMap<>( WeekDays.class );
        dayMap.put( WeekDays.MONDAY , "Working day");
        dayMap.put( WeekDays.FRIDAY , "Day off");
        System.out.println( dayMap );




    }

}
