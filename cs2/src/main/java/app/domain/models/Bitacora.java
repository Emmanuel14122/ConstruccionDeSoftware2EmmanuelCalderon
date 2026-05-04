package app.domain.models;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Bitacora {

    private String idBitacora;
    private String operationType;
    private LocalDateTime operationDateTime;
    private Long idUser;
    private String rolUser;
    private String idProductoAfectado;

    private Map<String, Object> detailData;
}