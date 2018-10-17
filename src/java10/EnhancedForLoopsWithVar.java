package java10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EnhancedForLoopsWithVar {

	public void looping2Darray() {
		String names[][] = {};

		for (/* 1 */String /* 2 */ t/* 3 */[/* 4 */]/* 5 */ : names) {

		}

		for (/* 1 */String[/* 2 */] /* 3 */ t/* 4 */ /* 5 */ : names) {

		}
	}

	public void conditionalExpressionHavingDiamond(boolean input) {
		List<String> names = input ? new ArrayList<>() : new LinkedList<>();
		String t = names.get(0);

		Runnable r = () -> {
		};
	}

	public void anonymousClasses() {
		Runnable r = () -> {
		};
	}

	public void savingComments() {

		/* leading */
		/* 1 */String/* 2 */ value = "asdfaksldkf";

		/* 1 */String /* 2 */ [/* 3 */] /* 4 */ names0 /* 5 */ = new String[] {};

		/* 1 */String /* 2 */ /* 4 */ names1 /* 6 */ [/* 3 */] /* 5 */ = new String[] {};
	}

	public void conditionalExpression(boolean input) {
		List<String> names = input ? new ArrayList<String>() : new LinkedList<String>();

		List<String> names3 = input ? input ? new ArrayList<String>() : new ArrayList<>() : new LinkedList<String>();

		String t = names.get(0);

		names.forEach(name -> {

		});
	}

	public void conditionalExpression_withDiamond(boolean input) {
		ArrayList<UserDefinedType> list = new ArrayList<>();
		List<String> names = input ? new ArrayList<>() : new LinkedList<String>();

		list.forEach(name -> {

		});
	}

	public void conditionalExpression_withWildCard(boolean input) {
		List<?> names = input ? new ArrayList<String>() : new LinkedList<Object>();

		names.forEach(name -> {

		});
	}

}
