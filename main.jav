
    public static boolean isInArray(String[] array, String value) {
        for (String item : array) {
            if (item.equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}
