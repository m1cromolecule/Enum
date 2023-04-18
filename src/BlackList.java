import java.util.List;

public enum BlackList {
    TERRORS (List.of("Samudinov Baijan", "Nurbeck uulu Chyngyz", "Tokoldoshev Anvar")),

    EXTREMS (List.of("Useyn Bolt", "Skriptonit Raper", "Van Gog")),

    SKAMERS (List.of("Turdukeev Kairat", "Isak Razakov", "Esh Ketshum"));

    private List<String> list;

    BlackList(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
