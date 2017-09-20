package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTextoEstagio is a Querydsl query type for TextoEstagio
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTextoEstagio extends EntityPathBase<TextoEstagio> {

    private static final long serialVersionUID = -471545306L;

    public static final QTextoEstagio textoEstagio = new QTextoEstagio("textoEstagio");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath metodologia = createString("metodologia");

    public final StringPath objetivo = createString("objetivo");

    public final StringPath planoAtividades = createString("planoAtividades");

    public final StringPath resumo = createString("resumo");

    public QTextoEstagio(String variable) {
        super(TextoEstagio.class, forVariable(variable));
    }

    public QTextoEstagio(Path<? extends TextoEstagio> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTextoEstagio(PathMetadata<?> metadata) {
        super(TextoEstagio.class, metadata);
    }

}

