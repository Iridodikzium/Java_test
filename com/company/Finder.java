package com.company;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder {
    /**
     * Поиск людей старше определенного возраста в группах.
     *
     * @param groups группы
     * @param targetAge возраст для поиска
     * @return список имён членов групп, возраст которых старше targetAge
     */
    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = groups.stream()
                .flatMap(gn -> gn.getMembers().stream()
                        .filter(ag -> ag.getAge() > targetAge)
                        .map(n -> n.getName()))
                .collect(Collectors.toSet());
        return groupsNames;
    }
}
