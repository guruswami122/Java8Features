
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class NextdayWeek {
	

	public static void main(String[] args) {
	LocalDate startDate = LocalDate.now();
	LocalDate nextMonday = startDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
    long daysBetween = ChronoUnit.DAYS.between(nextMonday,
            nextMonday.with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));
     List<LocalDate> list=Stream.iterate(nextMonday, date -> date.plusDays(1)).limit(daysBetween).collect(Collectors.toList());
     list.forEach(System.out::println);
	
}
}
