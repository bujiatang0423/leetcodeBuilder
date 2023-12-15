package com.leetcode.leetcode.graph;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * 通过广度优先算法
 * 实现最小路径找到目标人物
 * @author bujiatang
 */
public class FindPeggy {
    /**
     * 人物关系图，用来存放人物关系
     */
     private static HashMap<String, List<String>> relationMap = new HashMap<>();

    public static void main(String[] args) {
        relationMap.put("you", new ArrayList<>(Arrays.asList("alice", "bob", "claire")));
        relationMap.put("bob", new ArrayList<>(Arrays.asList("anuj", "peggy")));
        relationMap.put("claire", new ArrayList<>(Arrays.asList("thom", "jonny")));
        String targetPerson = "peggy";
        String startingPerson = "you";
        final HashMap<String, String> processMap = new HashMap<>();
        boolean found = breadthFirstSearch(startingPerson, targetPerson,processMap);
        if (found) {
            System.out.println(targetPerson + " is found!");
            printPath("you","peggy",processMap);
        } else {
            System.out.println(targetPerson + " is not found.");
        }
    }
    private static boolean breadthFirstSearch(String start, String target,Map<String,String> processMap) {
        //队列
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String currentPerson = queue.poll();
            System.out.println("Checking " + currentPerson);
            if (currentPerson.equals(target)) {
                return true;  // 找到目标
            }
            final List<String> personList = relationMap.get(currentPerson);
            if (personList != null) {
                for (String neighbor : personList) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                        processMap.put(neighbor,currentPerson);
                    }
                }
            }
        }

        return false;  // 未找到目标
    }

    private static void printPath(String start, String target, Map<String, String> predecessors) {
        System.out.println("Path from " + start + " to " + target + ": ");
        String current = target;
        System.out.println("这里是  predeccors");
        predecessors.forEach((s, s2) -> System.out.println(s+" : "+s2));

        while (current != null) {
            System.out.print(current);
            current = predecessors.get(current);
            if (current != null) {
                System.out.print(" <- ");
            }
        }
        System.out.println();
    }

}
