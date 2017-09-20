package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCurso is a Querydsl query type for Curso
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCurso extends EntityPathBase<Curso> {

    private static final long serialVersionUID = -524405178L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCurso curso = new QCurso("curso");

    public final SetPath<AreaEstagio, QAreaEstagio> areasEstagio = this.<AreaEstagio, QAreaEstagio>createSet("areasEstagio", AreaEstagio.class, QAreaEstagio.class, PathInits.DIRECT2);

    public final BooleanPath ativo = createBoolean("ativo");

    public final NumberPath<Short> codigo = createNumber("codigo", Short.class);

    public final QDocente coordenador;

    public final SetPath<Docente, QDocente> docentes = this.<Docente, QDocente>createSet("docentes", Docente.class, QDocente.class, PathInits.DIRECT2);

    public final EnumPath<br.ufms.estagio.enumerate.ModalidadeCurso> modalidade = createEnum("modalidade", br.ufms.estagio.enumerate.ModalidadeCurso.class);

    public final StringPath nome = createString("nome");

    public final EnumPath<br.ufms.estagio.enumerate.Periodo> periodo = createEnum("periodo", br.ufms.estagio.enumerate.Periodo.class);

    public final QDocente presidenteCoe;

    public final StringPath sigla = createString("sigla");

    public final QUnidade unidade;

    public QCurso(String variable) {
        this(Curso.class, forVariable(variable), INITS);
    }

    public QCurso(Path<? extends Curso> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCurso(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCurso(PathMetadata<?> metadata, PathInits inits) {
        this(Curso.class, metadata, inits);
    }

    public QCurso(Class<? extends Curso> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coordenador = inits.isInitialized("coordenador") ? new QDocente(forProperty("coordenador"), inits.get("coordenador")) : null;
        this.presidenteCoe = inits.isInitialized("presidenteCoe") ? new QDocente(forProperty("presidenteCoe"), inits.get("presidenteCoe")) : null;
        this.unidade = inits.isInitialized("unidade") ? new QUnidade(forProperty("unidade"), inits.get("unidade")) : null;
    }

}

