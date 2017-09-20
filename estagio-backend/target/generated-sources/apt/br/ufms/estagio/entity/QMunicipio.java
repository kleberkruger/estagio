package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMunicipio is a Querydsl query type for Municipio
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMunicipio extends EntityPathBase<Municipio> {

    private static final long serialVersionUID = 874047639L;

    public static final QMunicipio municipio = new QMunicipio("municipio");

    public final NumberPath<Integer> codigo = createNumber("codigo", Integer.class);

    public final StringPath nome = createString("nome");

    public final StringPath uf = createString("uf");

    public QMunicipio(String variable) {
        super(Municipio.class, forVariable(variable));
    }

    public QMunicipio(Path<? extends Municipio> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMunicipio(PathMetadata<?> metadata) {
        super(Municipio.class, metadata);
    }

}

