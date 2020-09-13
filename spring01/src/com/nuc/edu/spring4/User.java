package com.nuc.edu.spring4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
    private String[] arr;
    private List<String> li;
    private Set<String> se;
    private Map<String,String> map;

    public User(String[] arr, List<String> li, Set<String> se, Map<String, String> map) {
        this.arr = arr;
        this.li = li;
        this.se = se;
        this.map = map;
    }

    public User() {
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List<String> getLi() {
        return li;
    }

    public void setLi(List<String> li) {
        this.li = li;
    }

    public Set<String> getSe() {
        return se;
    }

    public void setSe(Set<String> se) {
        this.se = se;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "User{" +
                "arr=" + Arrays.toString(arr) +
                ", li=" + li +
                ", se=" + se +
                ", map=" + map +
                '}';
    }
}
