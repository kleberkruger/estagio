package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QConcedenteInfo is a Querydsl query type for ConcedenteInfo
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QConcedenteInfo extends EntityPathBase<ConcedenteInfo> {

    private static final long serialVersionUID = 1024782782L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConcedenteInfo concedenteInfo = new QConcedenteInfo("concedenteInfo");

    public final QConcedente concedente;

    public final StringPath contato = createString("contato");

    public final BooleanPath conveniada = createBoolean("conveniada");

    public final DatePath<java.time.LocalDate> convenioInicio = createDate("convenioInicio", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> convenioTermino = createDate("convenioTermino", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QRepresentanteLegal representanteLegal;

    public QConcedenteInfo(String variable) {
        this(ConcedenteInfo.class, forVariable(variable), INITS);
    }

    public QConcedenteInfo(Path<? extends ConcedenteInfo> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConcedenteInfo(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConcedenteInfo(PathMetadata<?> metadata, PathInits inits) {
        this(ConcedenteInfo.class, metadata, inits);
    }

    public QConcedenteInfo(Class<? extends ConcedenteInfo> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.concedente = inits.isInitialized("concedente") ? new QConcedente(forProperty("concedente"), inits.get("concedente")) : null;
        this.representanteLegal = inits.isInitialized("representanteLegal") ? new QRepresentanteLegal(forProperty("representanteLegal"), inits.get("representanteLegal")) : null;
    }

}

