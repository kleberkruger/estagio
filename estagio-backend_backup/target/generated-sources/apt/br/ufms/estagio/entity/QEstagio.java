package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QEstagio is a Querydsl query type for Estagio
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEstagio extends EntityPathBase<Estagio> {

    private static final long serialVersionUID = 276853116L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEstagio estagio = new QEstagio("estagio");

    public final QAreaEstagio area;

    public final QConcedenteInfo concedente;

    public final DatePath<java.time.LocalDate> dataInicio = createDate("dataInicio", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> dataTermino = createDate("dataTermino", java.time.LocalDate.class);

    public final QDiscente estagiario;

    public final CollectionPath<HorarioEstagiario, QHorarioEstagiario> horarios = this.<HorarioEstagiario, QHorarioEstagiario>createCollection("horarios", HorarioEstagiario.class, QHorarioEstagiario.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<br.ufms.estagio.enumerate.ModalidadeEstagio> modalidade = createEnum("modalidade", br.ufms.estagio.enumerate.ModalidadeEstagio.class);

    public final EnumPath<br.ufms.estagio.enumerate.ModalidadeOrientacao> modalidadeOrientacao = createEnum("modalidadeOrientacao", br.ufms.estagio.enumerate.ModalidadeOrientacao.class);

    public final QDocente orientador;

    public final QSeguro seguro;

    public final QStatusEstagio status;

    public final QSupervisor supervisor;

    public final QTextoEstagio texto;

    public final NumberPath<Double> valorAuxilioTransporte = createNumber("valorAuxilioTransporte", Double.class);

    public final NumberPath<Double> valorBolsa = createNumber("valorBolsa", Double.class);

    public QEstagio(String variable) {
        this(Estagio.class, forVariable(variable), INITS);
    }

    public QEstagio(Path<? extends Estagio> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEstagio(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEstagio(PathMetadata<?> metadata, PathInits inits) {
        this(Estagio.class, metadata, inits);
    }

    public QEstagio(Class<? extends Estagio> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.area = inits.isInitialized("area") ? new QAreaEstagio(forProperty("area")) : null;
        this.concedente = inits.isInitialized("concedente") ? new QConcedenteInfo(forProperty("concedente"), inits.get("concedente")) : null;
        this.estagiario = inits.isInitialized("estagiario") ? new QDiscente(forProperty("estagiario"), inits.get("estagiario")) : null;
        this.orientador = inits.isInitialized("orientador") ? new QDocente(forProperty("orientador"), inits.get("orientador")) : null;
        this.seguro = inits.isInitialized("seguro") ? new QSeguro(forProperty("seguro")) : null;
        this.status = inits.isInitialized("status") ? new QStatusEstagio(forProperty("status")) : null;
        this.supervisor = inits.isInitialized("supervisor") ? new QSupervisor(forProperty("supervisor"), inits.get("supervisor")) : null;
        this.texto = inits.isInitialized("texto") ? new QTextoEstagio(forProperty("texto")) : null;
    }

}

