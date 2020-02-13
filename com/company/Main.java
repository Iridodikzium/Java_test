package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //создаём списки членов групп
        List<Member> memberListF = new ArrayList<>();
        memberListF.add(new Member("Peter", 25));
        memberListF.add(new Member("Helen", 32));
        memberListF.add(new Member("Kate", 27));
        List<Member> memberListS = new ArrayList<>();
        memberListS.add(new Member("Tom", 26));
        memberListS.add(new Member("Ben", 29));
        memberListS.add(new Member("Sara", 28));

        //создаём список групп
        List<MembersGroup> membersGroupList = new ArrayList<>();
        membersGroupList.add(new MembersGroup("personnel department", memberListF));
        membersGroupList.add(new MembersGroup("logistics department", memberListS));

        Scanner in = new Scanner(System.in);
        System.out.print("Input an age: ");
        //возраст для поиска людей
        int targetAge = in.nextInt();

        Finder finder = new Finder();
        //список имён членов групп, возраст которых старше targetAge
        Set<String> groupsNamesNew = finder.findOldMembers(membersGroupList, targetAge);
        //если возраст всех членов групп меньше targetAge (нет людей и список пуст)
        if (groupsNamesNew.isEmpty()){
            System.out.println("There are no people older than "+ targetAge + " in the list");
        }
        //если список не пуст
        else {
            System.out.println(groupsNamesNew);
        }

    }
}
