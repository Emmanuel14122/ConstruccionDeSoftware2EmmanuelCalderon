package app.domain.models;

import java.util.Date;
import java.util.Map;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor


public class Bitacora {
    String idBitacora;
    String operationType;
    Date operationDate;
    UserSystem userSystem;

    Map<String, Object> detailData;
}