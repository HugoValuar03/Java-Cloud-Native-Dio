package domain;

public final class Client{
    // Para não ser possível outra classe herdar esta classe, é usado o final
    private String document;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
