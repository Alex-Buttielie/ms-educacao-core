package br.com.coreeduc.aplication.contraints;

public enum LocalizacaoDiferenciadaResidencia {
    AREA_ASSENTAMENTO(1),
    TERRA_INDIGENA(2),
    AREA_REMANECENTE_QUILOMBO(3),
    NAO_ESTA_EM_LOCALIZACAO_DIFERENCIADA(4);

    private Integer code;

    LocalizacaoDiferenciadaResidencia(Integer code) {
        this.code = code;
    }

    public static LocalizacaoDiferenciadaResidencia getByCode(Integer integer) {
        for (LocalizacaoDiferenciadaResidencia localizacaoDiferenciadaResidencia : values()) {
            if (localizacaoDiferenciadaResidencia.code.equals(integer)) {
                return localizacaoDiferenciadaResidencia;
            }
        }
        return null;
    }
}
