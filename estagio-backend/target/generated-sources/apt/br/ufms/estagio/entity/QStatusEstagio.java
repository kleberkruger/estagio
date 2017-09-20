package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QStatusEstagio is a Querydsl query type for StatusEstagio
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QStatusEstagio extends EntityPathBase<StatusEstagio> {

    private static final long serialVersionUID = 1595162026L;

    public static final QStatusEstagio statusEstagio = new QStatusEstagio("statusEstagio");

    public final BooleanPath estagioAprovado = createBoolean("estagioAprovado");

    public final DateTimePath<java.util.Date> estagioAprovadoEm = createDateTime("estagioAprovadoEm", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath localAprovado = createBoolean("localAprovado");

    public final DateTimePath<java.util.Date> localAprovadoEm = createDateTime("localAprovadoEm", java.util.Date.class);

    public final BooleanPath relatorioFinalAprovado = createBoolean("relatorioFinalAprovado");

    public final DateTimePath<java.util.Date> relatorioFinalAprovadoEm = createDateTime("relatorioFinalAprovadoEm", java.util.Date.class);

    public QStatusEstagio(String variable) {
        super(StatusEstagio.class, forVariable(variable));
    }

    public QStatusEstagio(Path<? extends StatusEstagio> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStatusEstagio(PathMetadata<?> metadata) {
        super(StatusEstagio.class, metadata);
    }

}

