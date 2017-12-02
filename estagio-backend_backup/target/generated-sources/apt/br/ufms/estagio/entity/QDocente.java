package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QDocente is a Querydsl query type for Docente
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDocente extends EntityPathBase<Docente> {

    private static final long serialVersionUID = -740740804L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDocente docente = new QDocente("docente");

    public final QSupervisor _super;

    //inherited
    public final BooleanPath aprovado;

    //inherited
    public final DateTimePath<java.util.Date> aprovadoEm;

    //inherited
    public final BooleanPath ativo;

    //inherited
    public final StringPath cargo;

    //inherited
    public final StringPath cpfCnpj;

    public final SetPath<Curso, QCurso> cursos = this.<Curso, QCurso>createSet("cursos", Curso.class, QCurso.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.util.Date> dataAtualizacao;

    //inherited
    public final DateTimePath<java.util.Date> dataCriacao;

    public final DatePath<java.time.LocalDate> dataIngresso = createDate("dataIngresso", java.time.LocalDate.class);

    // inherited
    public final QEndereco endereco;

    //inherited
    public final CollectionPath<EnderecoEletronico, QEnderecoEletronico> enderecosEletronicos;

    //inherited
    public final CollectionPath<FormacaoAcademica, QFormacaoAcademica> formacoesAcademicas;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath lattesUrl;

    //inherited
    public final StringPath nacionalidade;

    //inherited
    public final StringPath nome;

    //inherited
    public final NumberPath<Integer> rgNumero;

    //inherited
    public final StringPath rgOrgaoExpedidor;

    //inherited
    public final StringPath senha;

    public final StringPath siape = createString("siape");

    //inherited
    public final CollectionPath<Telefone, QTelefone> telefones;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoPessoa> tipoPessoa;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoUsuario> tipoUsuario;

    public QDocente(String variable) {
        this(Docente.class, forVariable(variable), INITS);
    }

    public QDocente(Path<? extends Docente> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDocente(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDocente(PathMetadata<?> metadata, PathInits inits) {
        this(Docente.class, metadata, inits);
    }

    public QDocente(Class<? extends Docente> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QSupervisor(type, metadata, inits);
        this.aprovado = _super.aprovado;
        this.aprovadoEm = _super.aprovadoEm;
        this.ativo = _super.ativo;
        this.cargo = _super.cargo;
        this.cpfCnpj = _super.cpfCnpj;
        this.dataAtualizacao = _super.dataAtualizacao;
        this.dataCriacao = _super.dataCriacao;
        this.endereco = _super.endereco;
        this.enderecosEletronicos = _super.enderecosEletronicos;
        this.formacoesAcademicas = _super.formacoesAcademicas;
        this.id = _super.id;
        this.lattesUrl = _super.lattesUrl;
        this.nacionalidade = _super.nacionalidade;
        this.nome = _super.nome;
        this.rgNumero = _super.rgNumero;
        this.rgOrgaoExpedidor = _super.rgOrgaoExpedidor;
        this.senha = _super.senha;
        this.telefones = _super.telefones;
        this.tipoPessoa = _super.tipoPessoa;
        this.tipoUsuario = _super.tipoUsuario;
    }

}

