import java.util.Scanner;

public class calendar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//prompt the user for the number of days in a month
		System.out.println("Number of days in a month: ");
		//store the value in the variable days
		int days = input.nextInt();
		//prompt the user for the first day of the month (0-6) 0 represents Sunday
		// and 6 represents Saturday
		System.out.println("First day of the month");
		String wordDay = input.nextLine();
		wordDay = input.nextLine();
		int firstDay;
		if("Sunday".equals(wordDay)) {
			firstDay = 0;
			//output the days of the week
			System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

			//initialize the variable i (this is the counter of days)
			int i = 0;

			//this for loop outputs the number of spaces before the first day
			for (; i < firstDay; i++ )

				System.out.print("     ");

			//this for loop is the counter that outputs the number of days
			for ( i = 1; i <= days; i++ ) {

				if (i < 10)

					System.out.print("    " + i );

				else

					System.out.print("   " + i );


				//if there are no spaces 
				if ((i + firstDay ) % 7 == 0 )

					System.out.println();

			}

			System.out.println();

		}
		else if("Monday".equals(wordDay)) {
			firstDay = 1;
			//output the days of the week
			System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

			//initialize the variable i (this is the counter of days)
			int i = 0;

			//this for loop outputs the number of spaces before the first day
			for (; i < firstDay; i++ )

				System.out.print("     ");

			//this for loop is the counter that outputs the number of days
			for ( i = 1; i <= days; i++ ) {

				if (i < 10)

					System.out.print("    " + i );

				else

					System.out.print("   " + i );


				//if there are no spaces 
				if ((i + firstDay ) % 7 == 0 )

					System.out.println();

			}

			System.out.println();

		}
		else if("Tuesday".equals(wordDay)) {
			firstDay = 2;
			//output the days of the week
			System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

			//initialize the variable i (this is the counter of days)
			int i = 0;

			//this for loop outputs the number of spaces before the first day
			for (; i < firstDay; i++ )

				System.out.print("     ");

			//this for loop is the counter that outputs the number of days
			for ( i = 1; i <= days; i++ ) {

				if (i < 10)

					System.out.print("    " + i );

				else

					System.out.print("   " + i );


				//if there are no spaces 
				if ((i + firstDay ) % 7 == 0 )

					System.out.println();

			}

			System.out.println();

		}
		else if("Wednesday".equals(wordDay)) {
			firstDay = 3;
			//output the days of the week
			System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

			//initialize the variable i (this is the counter of days)
			int i = 0;

			//this for loop outputs the number of spaces before the first day
			for (; i < firstDay; i++ )

				System.out.print("     ");

			//this for loop is the counter that outputs the number of days
			for ( i = 1; i <= days; i++ ) {

				if (i < 10)

					System.out.print("    " + i );

				else

					System.out.print("   " + i );


				//if there are no spaces 
				if ((i + firstDay ) % 7 == 0 )

					System.out.println();

			}

			System.out.println();

		}
		else if("Thursday".equals(wordDay)) {
			firstDay = 4;
			//output the days of the week
			System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

			//initialize the variable i (this is the counter of days)
			int i = 0;

			//this for loop outputs the number of spaces before the first day
			for (; i < firstDay; i++ )

				System.out.print("     ");

			//this for loop is the counter that outputs the number of days
			for ( i = 1; i <= days; i++ ) {

				if (i < 10)

					System.out.print("    " + i );

				else

					System.out.print("   " + i );


				//if there are no spaces 
				if ((i + firstDay ) % 7 == 0 )

					System.out.println();

			}

			System.out.println();

		}
		else if("Friday".equals(wordDay)) {
			firstDay = 5;
			//output the days of the week
			System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

			//initialize the variable i (this is the counter of days)
			int i = 0;

			//this for loop outputs the number of spaces before the first day
			for (; i < firstDay; i++ )

				System.out.print("     ");

			//this for loop is the counter that outputs the number of days
			for ( i = 1; i <= days; i++ ) {

				if (i < 10)

					System.out.print("    " + i );

				else

					System.out.print("   " + i );


				//if there are no spaces 
				if ((i + firstDay ) % 7 == 0 )

					System.out.println();

			}

			System.out.println();

		}
		else if("Saturday".equals(wordDay)) {
			firstDay =6;
			//output the days of the week
			System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");

			//initialize the variable i (this is the counter of days)
			int i = 0;

			//this for loop outputs the number of spaces before the first day
			for (; i < firstDay; i++ )

				System.out.print("     ");

			//this for loop is the counter that outputs the number of days
			for ( i = 1; i <= days; i++ ) {

				if (i < 10)

					System.out.print("    " + i );

				else

					System.out.print("   " + i );


				//if there are no spaces 
				if ((i + firstDay ) % 7 == 0 )

					System.out.println();

			}

			System.out.println();

		}

	}

}
