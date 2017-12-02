package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QEndereco is a Querydsl query type for Endereco
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEndereco extends EntityPathBase<Endereco> {

    private static final long serialVersionUID = -604087841L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEndereco endereco = new QEndereco("endereco");

    public final StringPath bairro = createString("bairro");

    public final StringPath cep = createString("cep");

    public final StringPath complemento = createString("complemento");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath logradouro = createString("logradouro");

    public final QMunicipio municipio;

    public final NumberPath<Short> numero = createNumber("numero", Short.class);

    public final StringPath referencia = createString("referencia");

    public QEndereco(String variable) {
        this(Endereco.class, forVariable(variable), INITS);
    }

    public QEndereco(Path<? extends Endereco> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEndereco(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QEndereco(PathMetadata<?> metadata, PathInits inits) {
        this(Endereco.class, metadata, inits);
    }

    public QEndereco(Class<? extends Endereco> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.municipio = inits.isInitialized("municipio") ? new QMunicipio(forProperty("municipio")) : null;
    }

}

