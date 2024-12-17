package com.project.assignment.day7;
import java.util.*;


public class ZeroTriplet {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of integers: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Set<List<Integer>> triplets = new HashSet<>();
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n- 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[i] + arr[j] + arr[k] == 0) {
                            List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                            Collections.sort(triplet);
                            triplets.add(triplet);
                        }
                    }
                }
            }
            System.out.println("Number of distinct triplets: " + triplets.size());

            System.out.println("The distinct triplets are:");
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet);
            }
            sc.close();
        }
    }


