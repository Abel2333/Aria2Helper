package org.abel;

public enum FileLocate {
    PRIMAL("/fxml/Interface.fxml"),
    URLDOWN("/fxml/URLDownload.fxml"),
    FILEDOWN("/fxml/FileDownload.fxml");

    private final String path;

    private FileLocate(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path;
    }
}
