package com.atifimal.dmo.task;

public class Calculate {
    static int push(StringBuilder sb, int pos, int n) {
        int sum = 0;
        boolean done = false, done2 = false;

        while (pos <= n && !done) {
            if (sb.indexOf("()") < pos && !done2) {
                StringBuilder sb2 = new StringBuilder().append(sb);
                sum += push(sb2, sb.indexOf("()"), pos - 1);
                done2 = true;
                if (pos == n) {
                    done = true;
                    break;
                }
            } else {
                if (pos == n) break;
                int y, g;
                if (!done2) y = sb.indexOf("()");
                else {
                    y = sb.indexOf("()", pos);
                    done2 = false;
                }
                sb.delete(y, y + 2);
                g = sb.indexOf("(", pos);
                sb.insert(g + 1, "()");
                pos = g + 1;
                sum++;
            }
        }
        return sum;
    }
}
