package com.atifimal.dmo.task;

import javax.ejb.Stateless;

@Stateless(mappedName="st1")
public class AppService_Impl implements AppService{
    public Integer getResult(int n) {
        int finalsum = 0;
        StringBuilder sb = new StringBuilder();

        if (n != 0) {
            for (int i = 0; i < n * 2; i++) {
                if (i % 2 == 0) sb.append('(');
                else sb.append(')');
            }

            finalsum++;
            Calculate calculate = new Calculate();
            finalsum += calculate.push(sb, 0, n * 2 - 3);
        }
        return finalsum;
    }
}
