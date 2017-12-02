package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QEnderecoEletronico is a Querydsl query type for EnderecoEletronico
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEnderecoEletronico extends EntityPathBase<EnderecoEletronico> {

    private static final long serialVersionUID = -846795399L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnderecoEletronico enderecoEletronico = new QEnderecoEletronico("enderecoEletronico");

    public final StringPath endereco = createString("endereco");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QPessoa pessoa;

    public final NumberPath<Short> prioridade = createNumber("prioridade", Short.class);

    public final StringPath tipo = createString("tipo");

    public QEnderecoEletronico(String variable) {
        this(EnderecoEletronico.class, forVariable(variable), INITS);
    }

    public QEnderecoEletronico(Path<? extends EnderecoEletronico> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEnderecoEletronico(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEnderecoEletronico(PathMetadata<?> metadata, PathInits inits) {
        this(EnderecoEletronico.class, metadata, inits);
    }

    public QEnderecoEletronico(Class<? extends EnderecoEletronico> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pessoa = inits.isInitialized("pessoa") ? new QPessoa(forProperty("pessoa"), inits.get("pessoa")) : null;
    }

}

