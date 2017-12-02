package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QConvenio is a Querydsl query type for Convenio
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QConvenio extends EntityPathBase<Convenio> {

    private static final long serialVersionUID = 1394375385L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConvenio convenio = new QConvenio("convenio");

    public final QConcedente concedente;

    public final DatePath<java.time.LocalDate> dataInicio = createDate("dataInicio", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> dataTermino = createDate("dataTermino", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath numero = createString("numero");

    public QConvenio(String variable) {
        this(Convenio.class, forVariable(variable), INITS);
    }

    public QConvenio(Path<? extends Convenio> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConvenio(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConvenio(PathMetadata<?> metadata, PathInits inits) {
        this(Convenio.class, metadata, inits);
    }

    public QConvenio(Class<? extends Convenio> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.concedente = inits.isInitialized("concedente") ? new QConcedente(forProperty("concedente"), inits.get("concedente")) : null;
    }

}

