package br.com.coreeduc.aplication.contraints;

public enum YepNo {
    YEP(1, true),
    NO(2, false);

    private Integer code;
    private Boolean valueBoolean;

    YepNo(Integer code, Boolean valueBoolean) {
        this.code = code;
        this.valueBoolean = valueBoolean;
    }

    public static Boolean getByCodeToBoolean(Integer code) {
        for (YepNo e : YepNo.values()) {
            if (e.code.equals(code)) {
                return e.valueBoolean;
            }
        }

        return false;
    }

}
