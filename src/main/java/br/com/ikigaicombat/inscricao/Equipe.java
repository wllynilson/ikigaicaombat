package br.com.ikigaicombat.inscricao;

public enum Equipe {
    ATRIUM,
    ATOS_JIU_JITSU,
    ALLIANCE_JIU_JITSU,
    BARAO_JJ,
    BPM_JJ,
    CAIO_TERRA,
    CARLSON_GRACIE,
    CHECK_MAT,
    GRACIE_HUMAITA,
    GRACIE_BARRA,
    GFTEAM,
    NOVA_UNIAO,
    OUTRA;

    public static String getValues() {
        StringBuilder values = new StringBuilder();
        for (Equipe equipe : Equipe.values()) {
            values.append(equipe.name()).append(", ");
        }
        // Remove the last comma and space
        if (values.length() > 0) {
            values.setLength(values.length() - 2);
        }
        return values.toString();
    }

}

