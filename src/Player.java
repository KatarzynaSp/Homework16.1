class Player {
    private String name;
    private int result;

    public Player(String name, int result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String toCsv() {
        return name + ";" + result + "\n";
    }

    @Override
    public String toString() {
        return "Zawodnik : " + name + ", wynik: " + result;
    }
}