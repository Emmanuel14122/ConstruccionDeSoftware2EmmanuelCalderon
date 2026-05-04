package app.domain.ports;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import app.domain.models.Bitacora;

public interface BitacoraPort {

    Optional<Bitacora> findById(String idBitacora);

    List<Bitacora> findByProductoAfectado(String idProductoAfectado);

    List<Bitacora> findByUser(Long idUser);

    List<Bitacora> findByOperationType(String operationType);

    List<Bitacora> findByDateRange(LocalDateTime from, LocalDateTime to);

    List<Bitacora> findAll();

    boolean existsById(String idBitacora);

    void save(Bitacora bitacora);
}
