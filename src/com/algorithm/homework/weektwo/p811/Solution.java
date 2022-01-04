package com.algorithm.homework.weektwo.p811;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new LinkedList<>();
        HashMap<String, Integer> cpDomianDetail = new HashMap<>(cpdomains.length * 3);
        for (String cpdomain : cpdomains) {
            String[] cpinfo = cpdomain.split(" ");
            Integer cp = Integer.valueOf(cpinfo[0]);
            String domian = cpinfo[1];

            cpDomianDetail.put(domian, cpDomianDetail.getOrDefault(domian, 0) + cp);
            while (domian.contains(".")) {
                domian = domian.substring(domian.indexOf(".") + 1);
                cpDomianDetail.put(domian, cpDomianDetail.getOrDefault(domian, 0) + cp);
            }
        }
        for (String key : cpDomianDetail.keySet()) {
            result.add(cpDomianDetail.get(key) + " " + key);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"}).toString());
    }
}
