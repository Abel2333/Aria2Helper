package org.abel.inf;

public enum FileLocate {
    PRIMAL("/fxml/InterfaceController.fxml"),
    URLDOWN("/fxml/URLController.fxml"),
    FILEDOWN("/fxml/FileController.fxml");

    private final String path;

    private FileLocate(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path;
    }
}
