package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAreaEstagio is a Querydsl query type for AreaEstagio
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAreaEstagio extends EntityPathBase<AreaEstagio> {

    private static final long serialVersionUID = 583355183L;

    public static final QAreaEstagio areaEstagio = new QAreaEstagio("areaEstagio");

    public final StringPath descricao = createString("descricao");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public QAreaEstagio(String variable) {
        super(AreaEstagio.class, forVariable(variable));
    }

    public QAreaEstagio(Path<? extends AreaEstagio> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAreaEstagio(PathMetadata<?> metadata) {
        super(AreaEstagio.class, metadata);
    }

}

