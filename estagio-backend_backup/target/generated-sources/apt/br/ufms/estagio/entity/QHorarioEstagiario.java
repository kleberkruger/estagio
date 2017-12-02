package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QHorarioEstagiario is a Querydsl query type for HorarioEstagiario
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHorarioEstagiario extends EntityPathBase<HorarioEstagiario> {

    private static final long serialVersionUID = -1084941184L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHorarioEstagiario horarioEstagiario = new QHorarioEstagiario("horarioEstagiario");

    public final EnumPath<br.ufms.estagio.enumerate.Atividade> atividade = createEnum("atividade", br.ufms.estagio.enumerate.Atividade.class);

    public final EnumPath<java.time.DayOfWeek> diaSemana = createEnum("diaSemana", java.time.DayOfWeek.class);

    public final QEstagio estagio;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final TimePath<java.util.Date> inicio = createTime("inicio", java.util.Date.class);

    public final TimePath<java.util.Date> termino = createTime("termino", java.util.Date.class);

    public QHorarioEstagiario(String variable) {
        this(HorarioEstagiario.class, forVariable(variable), INITS);
    }

    public QHorarioEstagiario(Path<? extends HorarioEstagiario> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHorarioEstagiario(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHorarioEstagiario(PathMetadata<?> metadata, PathInits inits) {
        this(HorarioEstagiario.class, metadata, inits);
    }

    public QHorarioEstagiario(Class<? extends HorarioEstagiario> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.estagio = inits.isInitialized("estagio") ? new QEstagio(forProperty("estagio"), inits.get("estagio")) : null;
    }

}

