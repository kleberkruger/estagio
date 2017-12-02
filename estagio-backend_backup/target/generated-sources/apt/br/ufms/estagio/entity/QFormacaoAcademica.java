package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QFormacaoAcademica is a Querydsl query type for FormacaoAcademica
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QFormacaoAcademica extends EntityPathBase<FormacaoAcademica> {

    private static final long serialVersionUID = -1099886928L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFormacaoAcademica formacaoAcademica = new QFormacaoAcademica("formacaoAcademica");

    public final NumberPath<Short> anoConclusao = createNumber("anoConclusao", Short.class);

    public final StringPath area = createString("area");

    public final EnumPath<br.ufms.estagio.enumerate.GrauAcademico> grauAcademico = createEnum("grauAcademico", br.ufms.estagio.enumerate.GrauAcademico.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath instituicao = createString("instituicao");

    public final QSupervisor supervisor;

    public final StringPath titulo = createString("titulo");

    public QFormacaoAcademica(String variable) {
        this(FormacaoAcademica.class, forVariable(variable), INITS);
    }

    public QFormacaoAcademica(Path<? extends FormacaoAcademica> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFormacaoAcademica(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFormacaoAcademica(PathMetadata<?> metadata, PathInits inits) {
        this(FormacaoAcademica.class, metadata, inits);
    }

    public QFormacaoAcademica(Class<? extends FormacaoAcademica> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.supervisor = inits.isInitialized("supervisor") ? new QSupervisor(forProperty("supervisor"), inits.get("supervisor")) : null;
    }

}

