class Problem {

    /**
     * the banker ' s gain of a certain sum due 3 years hence at 10 % per annum is rs . 36 . what is the present worth ? n0 = 3.0 n1 = 10.0 n2 = 36.0
     */
    public static Object problem() {
        double n0 = 3.0;
        double n1 = 10.0;
        double n2 = 36.0;
        double t0 = n2 * 100.0;
        double t1 = n0 * n1;
        double t2 = t0 / t1;
        double t3 = t2 * 100.0;
        double answer = t3 / t1;
        return answer;
    }
}


class Problem {

    /**
     * sophia finished 2 / 3 of a book . she calculated that she finished 90 more pages than she has yet to read . how long is her book ? n0 = 2.0 n1 = 3.0 n2 = 90.0
     */
    public static Object problem() {
        double n0 = 2.0;
        double n1 = 3.0;
        double n2 = 90.0;
        double t0 = n0 / n1;
        double t1 = 1.0 - t0;
        double answer = n2 / t1;
        return answer;
    }
}


class Problem {

    /**
     * 120 is what percent of 50 ? n0 = 120.0 n1 = 50.0
     */
    public static Object problem() {
        double n0 = 120.0;
        double n1 = 50.0;
        double t0 = n0 / n1;
        double answer = t0 * 100.0;
        return answer;
    }
}



class Problem {

    /**
     * there are 10 girls and 20 boys in a classroom . what is the ratio of girls to boys ? n0 = 10.0 n1 = 20.0
     */
    public static Object problem() {
        double n0 = 10.0;
        double n1 = 20.0;

        double answer = n0 / n1;
        return answer;
    }
}




