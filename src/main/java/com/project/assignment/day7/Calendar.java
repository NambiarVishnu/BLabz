package com.project.assignment.day7;

public class Calendar {
        public static int getDayOfWeek(int day, int month, int year) {
            if (month <= 2) {
                month += 12;
                year -= 1;
            }
            int y0 = year - (14 - month) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = month + 12 * ((14 - month) / 12) - 2;
            int d0 = (day + x + 31 * m0 / 12) % 7;
            return d0;
        }
        public static void printCalendar(int month, int year) {
            int daysInMonth = getDaysInMonth(month, year);
            int startDay = getDayOfWeek(1, month, year);
            int[][] calendar = new int[6][7];
            int day = 1;
            for (int week = 0; week < 6; week++) {
                for (int dayOfWeek = 0; dayOfWeek < 7; dayOfWeek++) {
                    if (week == 0 && dayOfWeek < startDay) {
                        calendar[week][dayOfWeek] = 0;
                    } else if (day <= daysInMonth) {
                        calendar[week][dayOfWeek] = day++;
                    } else {
                        calendar[week][dayOfWeek] = 0;                     }
                }
            }
            System.out.println("Calendar for " + getMonthName(month) + " " + year);
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            for (int week = 0; week < 6; week++) {
                for (int dayOfWeek = 0; dayOfWeek < 7; dayOfWeek++) {
                    if (calendar[week][dayOfWeek] == 0) {
                        System.out.print("   ");
                    } else {
                        System.out.printf("%3d", calendar[week][dayOfWeek]); // Print day
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        public static int getDaysInMonth(int month, int year) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        return 29;
                    } else {
                        return 28;
                    }
                default:
                    return 0;
            }
        }

        public static String getMonthName(int month) {
            switch (month) {
                case 1: return "January";
                case 2: return "February";
                case 3: return "March";
                case 4: return "April";
                case 5: return "May";
                case 6: return "June";
                case 7: return "July";
                case 8: return "August";
                case 9: return "September";
                case 10: return "October";
                case 11: return "November";
                case 12: return "December";
                default: return "";
            }
        }

        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Please provide month and year as command-line arguments.");
                return;
            }

            try {
                int month = Integer.parseInt(args[0]);
                int year = Integer.parseInt(args[1]);

                if (month < 1 || month > 12) {
                    System.out.println("Invalid month. Please enter a value between 1 and 12.");
                    return;
                }

                printCalendar(month, year);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide valid month and year as integers.");
            }
        }
    }


