package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSeguro is a Querydsl query type for Seguro
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSeguro extends EntityPathBase<Seguro> {

    private static final long serialVersionUID = 1366273171L;

    public static final QSeguro seguro = new QSeguro("seguro");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Long> numeroApolice = createNumber("numeroApolice", Long.class);

    public final StringPath seguradora = createString("seguradora");

    public QSeguro(String variable) {
        super(Seguro.class, forVariable(variable));
    }

    public QSeguro(Path<? extends Seguro> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSeguro(PathMetadata<?> metadata) {
        super(Seguro.class, metadata);
    }

}

