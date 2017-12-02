package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QTelefone is a Querydsl query type for Telefone
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTelefone extends EntityPathBase<Telefone> {

    private static final long serialVersionUID = 599350528L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTelefone telefone = new QTelefone("telefone");

    public final StringPath contato = createString("contato");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath mensageiro = createBoolean("mensageiro");

    public final StringPath numero = createString("numero");

    public final StringPath operadora = createString("operadora");

    public final QPessoa pessoa;

    public final NumberPath<Short> prioridade = createNumber("prioridade", Short.class);

    public final StringPath ramal = createString("ramal");

    public final StringPath uso = createString("uso");

    public QTelefone(String variable) {
        this(Telefone.class, forVariable(variable), INITS);
    }

    public QTelefone(Path<? extends Telefone> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTelefone(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QTelefone(PathMetadata<?> metadata, PathInits inits) {
        this(Telefone.class, metadata, inits);
    }

    public QTelefone(Class<? extends Telefone> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pessoa = inits.isInitialized("pessoa") ? new QPessoa(forProperty("pessoa"), inits.get("pessoa")) : null;
    }

}

