package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter5 {

	public static void main(String[] args) {
		//プログラム作成
		List<Task> action = new ArrayList<>();
		
		action.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。"));
		action.add(new Task(LocalDate.of(2021, 9, 15), "○○社面談。"));
		action.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う。"));
		action.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く。"));
		action.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。"));
		

		//Arrays.asList(action).stream().sorted().forEach(System.out::println);
		action.stream()
	    //年齢の降順かつ、誕生日の降順に並び替える。
	    .sorted(Comparator.comparing(Task::getDate))

	    .collect(Collectors.toList())
	    .forEach(System.out::println);
		
	}

}
