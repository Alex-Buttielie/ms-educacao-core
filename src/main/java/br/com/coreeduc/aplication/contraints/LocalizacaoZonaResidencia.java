package br.com.coreeduc.aplication.contraints;

public enum LocalizacaoZonaResidencia {
    URBANA(1),
    RURAL(2);

    private Integer code;

    LocalizacaoZonaResidencia(Integer code) {
        this.code = code;
    }

    public static LocalizacaoZonaResidencia getByCode(Integer integer) {
        for(LocalizacaoZonaResidencia z : values()) {
            if(z.code.equals(integer)) {
                return z;
            }
        }

        return null;
    }

}
