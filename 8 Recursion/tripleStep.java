// counts how many possibles the child can run up the stairs
public static int tripleStep(int n) {
    if (n < 0) {
        return 0;
    } else if (n == 0) {
        return 1;
    } else {
        return tripleStep(n - 1) + tripleStep(n - 2) + tripleStep(n - 3);
    }
}
