package org.abel;

public class GlobalConfig {
    private static class Config {
        private final ThreadLocal<String> aria2Path = new ThreadLocal<String>();
        private final ThreadLocal<String> logFile = new ThreadLocal<String>();
        private final ThreadLocal<String> dirPath = new ThreadLocal<String>();
        private final ThreadLocal<Integer> fileSplit = new ThreadLocal<Integer>();
        private final ThreadLocal<String> allocation = new ThreadLocal<String>();
        private final ThreadLocal<String> downContinue = new ThreadLocal<String>();
        private final ThreadLocal<Integer> connection = new ThreadLocal<Integer>();
        private final ThreadLocal<String> splitSize = new ThreadLocal<String>();

        public String getAria2Path() {
            return aria2Path.get();
        }

        public void setAria2Path(String aria2Path) {
            this.aria2Path.set(aria2Path);
        }

        public String getLogFile() {
            return logFile.get();
        }

        public void setLogFile(String logFile) {
            this.logFile.set(logFile);
        }

        public String getDirPath() {
            return dirPath.get();
        }

        public void setDirPath(String dirPath) {
            this.dirPath.set(dirPath);
        }

        public int getFileSplit() {
            return fileSplit.get();
        }

        public void setFileSplit(int fileSplit) {
            this.fileSplit.set(fileSplit);
        }

        public String getAllocation() {
            return allocation.get();
        }

        public void setAllocation(String allocation) {
            this.allocation.set(allocation);
        }

        public String getDownContinue() {
            return downContinue.get();
        }

        public void setDownContinue(String downContinue) {
            this.downContinue.set(downContinue);
        }

        public int getConnection() {
            return connection.get();
        }

        public void setConnection(int connection) {
            this.connection.set(connection);
        }

        public String getSplitSize() {
            return splitSize.get();
        }

        public void setSplitSize(String splitSize) {
            this.splitSize.set(splitSize);
        }
    }

    private static Config config;

    public static void init(Object conf) {
        config = (Config) conf;
    }

    public static Class<Config> getConfigClass() {
        return Config.class;
    }

    public static String getAria2Path() {
        return config.getAria2Path();
    }

    public static String getLogFile() {
        return config.getLogFile();
    }

    public static String getDirPath() {
        return config.getDirPath();
    }

    public static int getFileSplit() {
        return config.getFileSplit();
    }

    public static String getAllocation() {
        return config.getAllocation();
    }

    public static String getDownContinue() {
        return config.getDownContinue();
    }

    public static int getConnection() {
        return config.getConnection();
    }

    public static String getSplitSize() {
        return config.getSplitSize();
    }

}
