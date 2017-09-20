package br.ufms.estagio.controller;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QGenericController is a Querydsl query type for GenericController
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QGenericController extends EntityPathBase<GenericController<? extends br.ufms.estagio.entity.Entidade<? extends java.io.Serializable>, ? extends java.io.Serializable>> {

    private static final long serialVersionUID = 1953529974L;

    public static final QGenericController genericController = new QGenericController("genericController");

    @SuppressWarnings("all")
    public QGenericController(String variable) {
        super((Class)GenericController.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QGenericController(Path<? extends GenericController> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    @SuppressWarnings("all")
    public QGenericController(PathMetadata<?> metadata) {
        super((Class)GenericController.class, metadata);
    }

}

