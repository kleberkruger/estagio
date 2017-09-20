package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QConcedente is a Querydsl query type for Concedente
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QConcedente extends EntityPathBase<Concedente> {

    private static final long serialVersionUID = 272896240L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConcedente concedente = new QConcedente("concedente");

    public final BooleanPath conveniado = createBoolean("conveniado");

    public final QPessoa dados;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QRepresentanteLegal representanteLegal;

    public QConcedente(String variable) {
        this(Concedente.class, forVariable(variable), INITS);
    }

    public QConcedente(Path<? extends Concedente> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConcedente(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QConcedente(PathMetadata<?> metadata, PathInits inits) {
        this(Concedente.class, metadata, inits);
    }

    public QConcedente(Class<? extends Concedente> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.dados = inits.isInitialized("dados") ? new QPessoa(forProperty("dados"), inits.get("dados")) : null;
        this.representanteLegal = inits.isInitialized("representanteLegal") ? new QRepresentanteLegal(forProperty("representanteLegal"), inits.get("representanteLegal")) : null;
    }

}

